package examples.Working_With_Conversions;

import com.groupdocs.cloud.conversion.api.*;
import com.groupdocs.cloud.conversion.client.ApiException;
import com.groupdocs.cloud.conversion.model.*;
import com.groupdocs.cloud.conversion.model.requests.*;
import examples.Utils;

public class Conversion_Java_Convert_To_Text {

	public static void main(String[] args) {

		ConversionApi apiInstance = new ConversionApi(Utils.AppSID, Utils.AppKey);
		try {

			ConvertSettings settings = new ConvertSettings();

			settings.setStorage(Utils.MYStorage);
			settings.setFilePath("conversions\\sample.docx");
			settings.setFormat("txt");

			DocxLoadOptions loadOptions = new DocxLoadOptions();
			loadOptions.setPassword("");
			loadOptions.setHideWordTrackedChanges(true);
			loadOptions.setDefaultFont("Arial");

			settings.setLoadOptions(loadOptions);

			TxtConvertOptions convertOptions = new TxtConvertOptions();
			convertOptions.setFromPage(1);
			convertOptions.setPagesCount(2);
			settings.setConvertOptions(convertOptions);

			settings.setOutputPath("converted\\totext");

			// convert to specified format
			apiInstance.convertDocument(new ConvertDocumentRequest(settings));
			System.out.println("Document conveted successfully.");

			Utils.getFolderFilesPath("converted\\totext");
		} catch (ApiException e) {
			System.err.println("Exception while calling ConversionApi:");
			e.printStackTrace();
		}
	}
}