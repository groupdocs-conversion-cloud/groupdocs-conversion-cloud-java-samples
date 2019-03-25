package examples.Working_With_Folder;

import com.groupdocs.cloud.conversion.api.*;
import com.groupdocs.cloud.conversion.client.ApiException;
import com.groupdocs.cloud.conversion.model.requests.*;
import examples.Utils;

public class Conversion_Java_Delete_Folder {

	public static void main(String[] args) {

		FolderApi apiInstance = new FolderApi(Utils.AppSID, Utils.AppKey);
		try {
			DeleteFolderRequest request = new DeleteFolderRequest("conversions\\conversions1", Utils.MYStorage, true);
			apiInstance.deleteFolder(request);
			System.out
					.println("Expected response type is Void: 'conversions/conversions1' folder deleted recusrsively.");
		} catch (ApiException e) {
			System.err.println("Exception while calling FolderApi:");
			e.printStackTrace();
		}
	}
}