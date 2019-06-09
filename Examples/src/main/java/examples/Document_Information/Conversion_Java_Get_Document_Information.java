package examples.Supported_File_Formats;

import com.groupdocs.cloud.conversion.client.*;
import com.groupdocs.cloud.conversion.model.*;
import com.groupdocs.cloud.conversion.model.requests.*;
import java.util.List;

import com.groupdocs.cloud.conversion.api.*;
import examples.Utils;

public class Conversion_Java_Get_Document_Information {

	public static void main(String[] args) {

		InfoApi apiInstance = new InfoApi(Utils.AppSID, Utils.AppKey);
		try {
			GetDocumentMetadataRequest request = new GetDocumentMetadataRequest();
			request.setStorageName(Utils.MYStorage);
			request.setFilePath("conversions\\sample.docx");
			
			DocumentMetadata response = apiInstance.getDocumentMetadata(request);

			System.out.println("Expected response type is DocumentMetadata: " + response.getPageCount());
		} catch (ApiException e) {
			System.err.println("Exception while calling InfoApi:");
			e.printStackTrace();
		}
	}
}
