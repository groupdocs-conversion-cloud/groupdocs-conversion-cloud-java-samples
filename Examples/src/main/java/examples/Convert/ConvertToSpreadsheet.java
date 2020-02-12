package examples.Convert;

import com.groupdocs.cloud.conversion.client.*;
import com.groupdocs.cloud.conversion.model.*;
import com.groupdocs.cloud.conversion.model.requests.*;
import com.groupdocs.cloud.conversion.api.*;
import examples.Constants;
import java.util.List;

/**
 * This example demonstrates how to convert word processing document into spreadsheet document
 */
public class ConvertToSpreadsheet {

	public static void main(String[] args) {
		try {
			// Create API instance
			ConvertApi apiInstance = new ConvertApi(Constants.GetConfiguration());

			// Prepare convert settings
			ConvertSettings settings = new ConvertSettings();
			settings.setFilePath("WordProcessing/four-pages.docx");
			settings.setFormat("xlsx");

			SpreadsheetConvertOptions convertOptions = new SpreadsheetConvertOptions();
			convertOptions.setFromPage(2);
			convertOptions.setPagesCount(1);
			convertOptions.setZoom(150);			

			settings.setConvertOptions(convertOptions);
			settings.setOutputPath("converted");

			List<StoredConvertedResult> result = apiInstance.convertDocument(new ConvertDocumentRequest(settings));

			System.out.println("Document converted: " + result.get(0).getUrl());

		} catch (ApiException e) {
			System.err.println("Exception:");
			e.printStackTrace();
		}
	}
}