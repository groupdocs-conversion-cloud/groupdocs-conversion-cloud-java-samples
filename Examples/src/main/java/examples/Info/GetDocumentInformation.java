package examples.Info;

import com.groupdocs.cloud.conversion.client.*;
import com.groupdocs.cloud.conversion.model.*;
import com.groupdocs.cloud.conversion.model.requests.*;
import com.groupdocs.cloud.conversion.api.*;
import examples.Constants;

/**
 * This example demonstrates how to get document info
 */
public class GetDocumentInformation {

	public static void main(String[] args) {

		InfoApi apiInstance = new InfoApi(Constants.GetConfiguration());
		try {

			GetDocumentMetadataRequest request = new GetDocumentMetadataRequest();
			request.setFilePath("WordProcessing/four-pages.docx");

			DocumentMetadata response = apiInstance.getDocumentMetadata(request);

			System.err.println("Pages Count: " + response.getPageCount());
		} catch (ApiException e) {
			System.err.println("Exception while calling InfoApi:");
			e.printStackTrace();
		}
	}
}