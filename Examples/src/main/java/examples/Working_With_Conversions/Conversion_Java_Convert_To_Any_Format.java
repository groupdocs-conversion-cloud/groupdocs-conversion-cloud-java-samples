package examples.Working_With_Conversions;

import com.groupdocs.cloud.conversion.api.*;
import com.groupdocs.cloud.conversion.client.ApiException;
import com.groupdocs.cloud.conversion.model.*;
import com.groupdocs.cloud.conversion.model.requests.*;
import examples.Utils;

public class Conversion_Java_Convert_To_Any_Format {

	public static void main(String[] args) {

		ConvertSettings settings = new ConvertSettings();

		settings.setStorage(Utils.MYStorage);
		settings.setFilePath("conversions\\password-protected.docx");
		settings.setFormat("xlsx");

		DocxLoadOptions loadOptions = new DocxLoadOptions();
		loadOptions.setPassword("password");
		loadOptions.setHideWordTrackedChanges(true);
		loadOptions.setDefaultFont("Arial");

		settings.setLoadOptions(loadOptions);

		XlsxConvertOptions convertOptions = new XlsxConvertOptions();
		convertOptions.setFromPage(1);
		convertOptions.setPagesCount(2);
		convertOptions.setFromPage(1);
		convertOptions.setPassword("password");
		convertOptions.setUsePdf(true);
		settings.setConvertOptions(convertOptions);

		settings.setOutputPath("converted\\tocells");

		// convert to any format
		convertToAnyFormat(settings);

		Utils.getFolderFilesPath("converted\\tocells");
	}

	static void convertToAnyFormat(ConvertSettings convertSettings) {
		ConversionApi apiInstance = new ConversionApi(Utils.AppSID, Utils.AppKey);
		try {

			// convert to specified format
			apiInstance.convertDocument(new ConvertDocumentRequest(convertSettings));
			System.out.println("Document conveted successfully.");

		} catch (ApiException e) {
			System.err.println("Exception while calling ConversionApi:");
			e.printStackTrace();
		}
	}
}