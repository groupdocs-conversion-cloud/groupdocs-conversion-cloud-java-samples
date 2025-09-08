package examples.Convert;

import com.groupdocs.cloud.conversion.client.*;
import com.groupdocs.cloud.conversion.model.*;
import com.groupdocs.cloud.conversion.model.requests.*;
import com.groupdocs.cloud.conversion.api.*;
import examples.Constants;

import java.io.File;
/**
 * This example demonstrates how to convert word processing document into pdf document stream
 */
public class ConvertToPdfResponseBody {

	public static void main(String[] args) {
		try {
			// Create API instance
			ConvertApi apiInstance = new ConvertApi(Constants.GetConfiguration());

			// Prepare convert settings
			ConvertSettings settings = new ConvertSettings();
			settings.setFilePath("WordProcessing/password-protected.docx");
			settings.setFormat("pdf");

			WordProcessingLoadOptions loadOptions = new WordProcessingLoadOptions();
			loadOptions.setPassword("password");

			settings.setLoadOptions(loadOptions);

			PdfConvertOptions convertOptions = new PdfConvertOptions();
			convertOptions.setCenterWindow(true);
			convertOptions.setCompressImages(false);
			convertOptions.setDisplayDocTitle(true);
			convertOptions.setDpi(1024);
			convertOptions.setFitWindow(false);
			convertOptions.setFromPage(1);
			convertOptions.setGrayscale(false);
			convertOptions.setImageQuality(100);
			convertOptions.setLinearize(false);
			convertOptions.setMarginTop(5);
			convertOptions.setMarginLeft(5);
			convertOptions.setPassword("password");
			convertOptions.setUnembedFonts(true);
			convertOptions.setRemoveUnusedStreams(true);
			convertOptions.setRemoveUnusedObjects(true);
			convertOptions.setRemovePdfaCompliance(false);

			settings.setConvertOptions(convertOptions);
			settings.setOutputPath(null); // set OutputPath as null will result the output as document IOStream

			File result = apiInstance.convertDocumentDownload(new ConvertDocumentRequest(settings));

			System.out.println("Document converted: " + result.length());

		} catch (ApiException e) {
			System.err.println("Exception:");
			e.printStackTrace();
		}
	}
}