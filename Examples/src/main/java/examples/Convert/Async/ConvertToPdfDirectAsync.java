package examples.Convert.Async;

import com.groupdocs.cloud.conversion.client.*;
import com.groupdocs.cloud.conversion.model.OperationResult;
import com.groupdocs.cloud.conversion.model.OperationResult.StatusEnum;
import com.groupdocs.cloud.conversion.model.requests.*;
import com.groupdocs.cloud.conversion.api.*;
import examples.Constants;

import java.io.File;
/**
 * This example demonstrates how to convert document into pdf without using cloud storage asyncronously
 */
public class ConvertToPdfDirectAsync {

	public static void main(String[] args) {
		try {
			// Create API instance
			AsyncApi apiInstance = new AsyncApi(Constants.GetConfiguration());

			File file = new File("examples\\src\\main\\resources\\WordProcessing\\four-pages.docx");

			String operationId = apiInstance.startConvert(new StartConvertRequest("pdf", file, 1, 0));

			System.out.println("Operation ID: " + operationId);

			while(true) {
				Thread.sleep(1000);
				OperationResult result = apiInstance.getOperationStatus(new GetOperationStatusRequest(operationId));
				if (result.getStatus() == StatusEnum.FINISHED)
				{
					File convertedFile = apiInstance.getOperationResult(new GetOperationResultRequest(operationId));
					System.out.println("Document converted: " + convertedFile.length());
					break;
				}
				else if (result.getStatus() == StatusEnum.FAILED) {
					System.out.println("Document converted failed: " + result.getError());
					break;
				}
				else
				{
					System.out.println("Operation status: " + result.getStatus());
				}
			}
		} catch (ApiException e) {
			System.err.println("Exception:");
			e.printStackTrace();
		}
		catch (InterruptedException e) {
			System.err.println("Exception:");
			e.printStackTrace();
		}		
	}
}