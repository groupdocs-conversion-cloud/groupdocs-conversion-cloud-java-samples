package examples.Common;

import com.groupdocs.cloud.conversion.client.*;
import com.groupdocs.cloud.conversion.model.*;
import com.groupdocs.cloud.conversion.model.requests.*;
import com.groupdocs.cloud.conversion.api.*;
import examples.Constants;

import java.util.Arrays;
import java.util.List;

/**
 * This example demonstrates how to convert specific pages from word processing document into pdf document
 */
public class ConvertSpecificPages {

	public static void main(String[] args) {
		try {
			// Create API instance
			ConvertApi apiInstance = new ConvertApi(Constants.GetConfiguration());

			// Prepare convert settings
			ConvertSettings settings = new ConvertSettings();
			settings.setFilePath("WordProcessing/four-pages.docx");
			settings.setFormat("pdf");

			PdfConvertOptions convertOptions = new PdfConvertOptions();
			convertOptions.setPages(Arrays.asList(new Integer[]{1, 3}));

			settings.setConvertOptions(convertOptions);
			settings.setOutputPath("converted/two-pages.pdf");

			List<StoredConvertedResult> result = apiInstance.convertDocument(new ConvertDocumentRequest(settings));

			System.out.println("Document converted: " + result.get(0).getUrl());

		} catch (ApiException e) {
			System.err.println("Exception:");
			e.printStackTrace();
		}
	}
}