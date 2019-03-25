package examples.Working_With_Folder;

import com.groupdocs.cloud.conversion.api.*;
import com.groupdocs.cloud.conversion.client.ApiException;
import com.groupdocs.cloud.conversion.model.requests.*;
import examples.Utils;

public class Conversion_Java_Copy_Folder {

	public static void main(String[] args) {

		FolderApi apiInstance = new FolderApi(Utils.AppSID, Utils.AppKey);
		try {
			CopyFolderRequest request = new CopyFolderRequest("conversions", "conversions1", Utils.MYStorage,
					Utils.MYStorage);
			apiInstance.copyFolder(request);
			System.out.println("Expected response type is Void: 'conversions' folder copied as 'conversions1'.");
		} catch (ApiException e) {
			System.err.println("Exception while calling FolderApi:");
			e.printStackTrace();
		}
	}
}