package examples.LoadOptionsByDocumentType.Presentation;

import com.groupdocs.cloud.conversion.client.*;
import com.groupdocs.cloud.conversion.model.*;
import com.groupdocs.cloud.conversion.model.PresentationLoadOptions.CommentsPositionEnum;
import com.groupdocs.cloud.conversion.model.requests.*;
import com.groupdocs.cloud.conversion.api.*;
import examples.Constants;
import java.util.*;

/**
 * This example demonstrates how to convert presentation document to pdf with advanced options
 */
public class ConvertPresentationByHidingComments {

	public static void main(String[] args) {
		try {
			// Create API instance
			ConvertApi apiInstance = new ConvertApi(Constants.GetConfiguration());

			// Prepare convert settings
			ConvertSettings settings = new ConvertSettings();
			settings.setFilePath("Presentation/with_notes.pptx");
			settings.setFormat("pdf");

			PresentationLoadOptions loadOptions = new PresentationLoadOptions();
			loadOptions.setCommentsPosition(CommentsPositionEnum.NONE);

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