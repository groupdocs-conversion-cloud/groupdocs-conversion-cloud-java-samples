package examples.Working_With_Conversions;

import com.groupdocs.cloud.conversion.api.*;
import com.groupdocs.cloud.conversion.client.ApiException;
import com.groupdocs.cloud.conversion.model.*;
import com.groupdocs.cloud.conversion.model.requests.*;
import examples.Utils;
import java.util.List;

public class Conversion_Java_Convert_To_Words {

	public static void main(String[] args) {

		ConvertApi apiInstance = new ConvertApi(Utils.AppSID, Utils.AppKey);
		try {

			ConvertSettings settings = new ConvertSettings();

			settings.setStorageName(Utils.MYStorage);
			settings.setFilePath("conversions\\sample.pdf");
			settings.setFormat("docx");

			PdfLoadOptions loadOptions = new PdfLoadOptions();
			loadOptions.setPassword("");
			loadOptions.setHidePdfAnnotations(true);
			loadOptions.setRemoveEmbeddedFiles(false);
			loadOptions.setFlattenAllFields(true);

			settings.setLoadOptions(loadOptions);

			DocxConvertOptions convertOptions = new DocxConvertOptions();
			convertOptions.setFromPage(1);
			convertOptions.setPagesCount(2);
			convertOptions.setZoom(100);
			convertOptions.setDpi(300.0);
			settings.setConvertOptions(convertOptions);

			settings.setOutputPath("converted\\towords");

			// convert to specified format
			List<StoredConvertedResult> response = apiInstance.convertDocument(new ConvertDocumentRequest(convertSettings));
			System.out.println("Document converted successfully: " + response.size());
		} catch (ApiException e) {
			System.err.println("Exception while calling ConvertApi:");
			e.printStackTrace();
		}
	}
}