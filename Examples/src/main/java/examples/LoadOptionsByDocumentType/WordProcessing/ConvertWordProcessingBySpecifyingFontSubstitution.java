package examples.LoadOptionsByDocumentType.WordProcessing;

import com.groupdocs.cloud.conversion.client.*;
import com.groupdocs.cloud.conversion.model.*;
import com.groupdocs.cloud.conversion.model.requests.*;
import com.groupdocs.cloud.conversion.api.*;
import examples.Constants;
import java.util.*;

/**
 * This example demonstrates how to convert word-processing document to pdf with advanced options
 */
public class ConvertWordProcessingBySpecifyingFontSubstitution {

	public static void main(String[] args) {
		try {
			// Create API instance
			ConvertApi apiInstance = new ConvertApi(Constants.GetConfiguration());

			// Prepare convert settings
			ConvertSettings settings = new ConvertSettings();
			settings.setFilePath("WordProcessing/with_tracked_changes.docx");
			settings.setFormat("pdf");

			WordProcessingLoadOptions loadOptions = new WordProcessingLoadOptions();			
			loadOptions.setDefaultFont("Helvetica");
			Map<String, String> fontSubs = new HashMap<String, String>();
			fontSubs.put("Tahoma", "Arial");
			fontSubs.put("Times New Roman", "Arial");			
			loadOptions.setFontSubstitutes(fontSubs);	

			settings.setLoadOptions(loadOptions);
			settings.setOutputPath("converted");

			List<StoredConvertedResult> result = apiInstance.convertDocument(new ConvertDocumentRequest(settings));

			System.out.println("Document converted: " + result.get(0).getUrl());

		} catch (ApiException e) {
			System.err.println("Exception:");
			e.printStackTrace();
		}
	}
}