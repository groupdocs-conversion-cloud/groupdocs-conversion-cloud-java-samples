package examples.Working_With_Storage;

import com.groupdocs.cloud.conversion.api.*;
import com.groupdocs.cloud.conversion.client.ApiException;
import com.groupdocs.cloud.conversion.model.*;
import com.groupdocs.cloud.conversion.model.requests.*;
import examples.Utils;

public class Conversion_Java_Get_File_Versions {

	public static void main(String[] args) {

		StorageApi apiInstance = new StorageApi(Utils.AppSID, Utils.AppKey);
		try {
			GetFileVersionsRequest request = new GetFileVersionsRequest("conversions\\one-page.docx", Utils.MYStorage);
			FileVersions response = apiInstance.getFileVersions(request);
			System.out.println("Expected response type is FileVersions: " + response.getValue().size());
		} catch (ApiException e) {
			System.err.println("Exception while calling StorageApi:");
			e.printStackTrace();
		}
	}
}