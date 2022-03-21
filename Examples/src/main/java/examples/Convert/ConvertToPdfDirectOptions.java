package examples.Convert;

import com.groupdocs.cloud.conversion.client.*;
import com.groupdocs.cloud.conversion.model.*;
import com.groupdocs.cloud.conversion.model.requests.*;
import com.groupdocs.cloud.conversion.api.*;
import examples.Constants;

import java.io.File;
/**
 * This example demonstrates how to convert document into pdf without using cloud storage
 */
public class ConvertToPdfDirectOptions {

	public static void main(String[] args) {
		try {
			// Create API instance
			ConvertApi apiInstance = new ConvertApi(Constants.GetConfiguration());

			File file = new File("examples\\src\\main\\resources\\WordProcessing\\password-protected.docx");
			DocxLoadOptions loadOptions = new DocxLoadOptions();
			loadOptions.setFormat("docx");
			loadOptions.setPassword("password");

			ConvertDocumentDirectRequest request = new ConvertDocumentDirectRequest("pdf", file, 1, 0, loadOptions, null); // all pages

			File result = apiInstance.convertDocumentDirect(request);

			System.out.println("Document converted: " + result.length());

		} catch (ApiException e) {
			System.err.println("Exception:");
			e.printStackTrace();
		}
	}
}