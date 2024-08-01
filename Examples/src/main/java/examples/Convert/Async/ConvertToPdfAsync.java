package examples.Convert.Async;

import com.groupdocs.cloud.conversion.client.*;
import com.groupdocs.cloud.conversion.model.*;
import com.groupdocs.cloud.conversion.model.OperationResult.StatusEnum;
import com.groupdocs.cloud.conversion.model.requests.*;
import com.groupdocs.cloud.conversion.api.*;
import examples.Constants;

/**
 * This example demonstrates how to convert word processing document into pdf document asyncronously
 */
public class ConvertToPdfAsync {

	public static void main(String[] args) {
		try {
			// Create API instance
			AsyncApi apiInstance = new AsyncApi(Constants.GetConfiguration());

			// Prepare convert settings
			ConvertSettings settings = new ConvertSettings();
			settings.setFilePath("WordProcessing/password-protected.docx");
			settings.setFormat("pdf");

			DocxLoadOptions loadOptions = new DocxLoadOptions();
			loadOptions.setPassword("password");

			settings.setLoadOptions(loadOptions);

			PdfConvertOptions convertOptions = new PdfConvertOptions();
			convertOptions.setCenterWindow(true);
			convertOptions.setCompressImages(false);
			convertOptions.setDisplayDocTitle(true);
			convertOptions.setDpi(1024);
			convertOptions.setFitWindow(false);
			convertOptions.setFromPage(1);
			convertOptions.setGrayscale(false);
			convertOptions.setImageQuality(100);
			convertOptions.setLinearize(false);
			convertOptions.setMarginTop(5);
			convertOptions.setMarginLeft(5);
			convertOptions.setPassword("password");
			convertOptions.setUnembedFonts(true);
			convertOptions.setRemoveUnusedStreams(true);
			convertOptions.setRemoveUnusedObjects(true);
			convertOptions.setRemovePdfaCompliance(false);

			settings.setConvertOptions(convertOptions);
			settings.setOutputPath("converted");

			String operationId = apiInstance.startConvertAndSave(new StartConvertAndSaveRequest(settings));

			System.out.println("Operation ID: " + operationId);

			while(true) {
				Thread.sleep(1000);
				OperationResult result = apiInstance.getOperationStatus(new GetOperationStatusRequest(operationId));
				if (result.getStatus() == StatusEnum.FINISHED)
				{
					System.out.println("Document converted successfully: " + result.getResult().get(0).getUrl());
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
		} catch (InterruptedException e) {
			System.err.println("Exception:");
			e.printStackTrace();
		}
	}
}