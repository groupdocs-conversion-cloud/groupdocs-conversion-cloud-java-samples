package examples.Working_With_Conversions;

import com.groupdocs.cloud.conversion.api.*;
import com.groupdocs.cloud.conversion.client.ApiException;
import com.groupdocs.cloud.conversion.model.*;
import com.groupdocs.cloud.conversion.model.requests.*;
import examples.Utils;
import java.util.List;

public class Conversion_Java_Convert_To_Cells {

	public static void main(String[] args) {

		ConvertApi apiInstance = new ConvertApi(Utils.AppSID, Utils.AppKey);
		try {

			ConvertSettings settings = new ConvertSettings();

			settings.setStorageName(Utils.MYStorage);
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

			// convert to specified format
			List<StoredConvertedResult> response = apiInstance.convertDocument(new ConvertDocumentRequest(convertSettings));
			System.out.println("Document converted successfully: " + response.size());
		} catch (ApiException e) {
			System.err.println("Exception while calling ConvertApi:");
			e.printStackTrace();
		}
	}
}