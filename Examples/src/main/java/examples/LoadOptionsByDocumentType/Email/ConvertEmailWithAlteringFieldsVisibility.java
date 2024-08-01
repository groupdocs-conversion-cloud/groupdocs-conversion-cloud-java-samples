package examples.LoadOptionsByDocumentType.Email;

import com.groupdocs.cloud.conversion.client.*;
import com.groupdocs.cloud.conversion.model.*;
import com.groupdocs.cloud.conversion.model.requests.*;
import com.groupdocs.cloud.conversion.api.*;
import examples.Constants;
import java.util.List;

/**
 * This example demonstrates how to convert msg document into pdf document
 */
public class ConvertEmailWithAlteringFieldsVisibility {

	public static void main(String[] args) {
		try {
			// Create API instance
			ConvertApi apiInstance = new ConvertApi(Constants.GetConfiguration());

			// Prepare convert settings
			ConvertSettings settings = new ConvertSettings();
			settings.setFilePath("Email/sample.msg");
			settings.setFormat("pdf");

			EmailLoadOptions loadOptions = new EmailLoadOptions();
			loadOptions.setDisplayHeader(true);
			loadOptions.setDisplayFromEmailAddress(false);
			loadOptions.setDisplayToEmailAddress(false);
			loadOptions.setDisplayCcEmailAddress(false);
			loadOptions.setDisplayBccEmailAddress(false);

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