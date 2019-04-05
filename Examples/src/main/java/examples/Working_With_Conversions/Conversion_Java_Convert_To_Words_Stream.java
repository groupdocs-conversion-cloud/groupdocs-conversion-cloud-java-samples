package examples.Working_With_Conversions;

import com.groupdocs.cloud.conversion.api.*;
import com.groupdocs.cloud.conversion.client.ApiException;
import com.groupdocs.cloud.conversion.model.*;
import com.groupdocs.cloud.conversion.model.requests.*;
import examples.Utils;
import java.io.File;

public class Conversion_Java_Convert_To_Words_Stream {

	public static void main(String[] args) {

		ConversionApi apiInstance = new ConversionApi(Utils.AppSID, Utils.AppKey);
		try {

			ConvertSettings settings = new ConvertSettings();

			settings.setStorageName(Utils.MYStorage);
			settings.setFilePath("converted\\\\topdf\\password-protected.pdf");
			settings.setFormat("docx");

			PdfLoadOptions loadOptions = new PdfLoadOptions();
			loadOptions.setPassword("password");
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

			// set OutputPath as empty will result the output as document IOStream
			settings.setOutputPath("");

			// convert to specified format
			File response = apiInstance.convertDocumentDownload(new ConvertDocumentRequest(settings));
			System.out.println("Document converted successfully: " + response);
		} catch (ApiException e) {
			System.err.println("Exception while calling ConversionApi:");
			e.printStackTrace();
		}
	}
}