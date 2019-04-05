package examples.Working_With_Conversions;

import com.groupdocs.cloud.conversion.api.*;
import com.groupdocs.cloud.conversion.client.ApiException;
import com.groupdocs.cloud.conversion.model.*;
import com.groupdocs.cloud.conversion.model.requests.*;
import examples.Utils;
import java.io.File;

public class Conversion_Java_Convert_To_Pdf_Stream {

	public static void main(String[] args) {

		ConversionApi apiInstance = new ConversionApi(Utils.AppSID, Utils.AppKey);
		try {

			ConvertSettings settings = new ConvertSettings();

			settings.setStorageName(Utils.MYStorage);
			settings.setFilePath("conversions\\password-protected.docx");
			settings.setFormat("pdf");

			DocxLoadOptions loadOptions = new DocxLoadOptions();
			loadOptions.setPassword("password");
			loadOptions.setHideWordTrackedChanges(true);
			loadOptions.setDefaultFont("Arial");

			settings.setLoadOptions(loadOptions);

			PdfConvertOptions convertOptions = new PdfConvertOptions();
			convertOptions.setFromPage(1);
			convertOptions.setPagesCount(2);
			convertOptions.setZoom(100);
			convertOptions.setDpi(300.0);
			convertOptions.setBookmarksOutlineLevel(1);
			convertOptions.setCenterWindow(true);
			convertOptions.setCompressImages(false);
			convertOptions.setDisplayDocTitle(true);
			convertOptions.setExpandedOutlineLevels(1);
			convertOptions.setFitWindow(false);
			convertOptions.setFromPage(1);
			convertOptions.setGrayscale(false);
			convertOptions.setHeadingsOutlineLevels(1);
			convertOptions.setImageQuality(100);
			convertOptions.setLinearize(false);
			convertOptions.setMarginTop(5);
			convertOptions.setMarginLeft(5);
			convertOptions.setPassword("password");
			convertOptions.setUnembedFonts(true);
			convertOptions.setRemoveUnusedStreams(true);
			convertOptions.setRemoveUnusedObjects(true);
			convertOptions.setRemovePdfaCompliance(false);
			convertOptions.setHeight(1024);
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