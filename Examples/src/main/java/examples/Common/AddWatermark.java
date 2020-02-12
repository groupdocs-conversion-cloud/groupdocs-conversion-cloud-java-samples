package examples.Common;

import com.groupdocs.cloud.conversion.client.*;
import com.groupdocs.cloud.conversion.model.*;
import com.groupdocs.cloud.conversion.model.requests.*;
import com.groupdocs.cloud.conversion.api.*;
import examples.Constants;
import java.util.List;

/**
 * This example demonstrates how to convert word processing document into pdf document with adding watermark
 */
public class AddWatermark {

	public static void main(String[] args) {
		try {
			// Create API instance
			ConvertApi apiInstance = new ConvertApi(Constants.GetConfiguration());

			// Prepare convert settings
			ConvertSettings settings = new ConvertSettings();
			settings.setFilePath("WordProcessing/four-pages.docx");
			settings.setFormat("pdf");

			WatermarkOptions watermark = new WatermarkOptions();			
			watermark.setText("Sample watermark");
			watermark.setColor("Red");
			watermark.setWidth(100);
			watermark.setHeight(100);
			watermark.setBackground(true);			

			PdfConvertOptions convertOptions = new PdfConvertOptions();
			convertOptions.setWatermarkOptions(watermark);


			settings.setConvertOptions(convertOptions);
			settings.setOutputPath("converted");

			List<StoredConvertedResult> result = apiInstance.convertDocument(new ConvertDocumentRequest(settings));

			System.out.println("Document converted: " + result.get(0).getUrl());

		} catch (ApiException e) {
			System.err.println("Exception:");
			e.printStackTrace();
		}
	}
}