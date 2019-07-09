package examples.Working_With_Files;

import com.groupdocs.cloud.conversion.api.*;
import com.groupdocs.cloud.conversion.client.ApiException;
import com.groupdocs.cloud.conversion.model.requests.*;
import examples.Utils;

public class Conversion_Java_Move_File {

	public static void main(String[] args) {

		FileApi apiInstance = new FileApi(Utils.AppSID, Utils.AppKey);
		try {

			MoveFileRequest request = new MoveFileRequest("conversions\\one-page.docx", "conversions1\\one-page1.docx",
					Utils.MYStorage, Utils.MYStorage, null);
			apiInstance.moveFile(request);
			System.out.println(
					"Expected response type is Void: 'conversions/one-page.docx' file moved to 'conversions1/one-page1.docx'.");
		} catch (ApiException e) {
			System.err.println("Exception while calling FileApi:");
			e.printStackTrace();
		}
	}
}