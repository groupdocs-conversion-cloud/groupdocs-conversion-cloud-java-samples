package examples;

import examples.Common.*;
import examples.Convert.*;
import examples.Convert.Async.*;
import examples.Info.*;
import examples.LoadOptionsByDocumentType.Cad.*;
import examples.LoadOptionsByDocumentType.Csv.*;
import examples.LoadOptionsByDocumentType.Email.*;
import examples.LoadOptionsByDocumentType.Html.*;
import examples.LoadOptionsByDocumentType.Note.*;
import examples.LoadOptionsByDocumentType.Pdf.*;
import examples.LoadOptionsByDocumentType.Presentation.*;
import examples.LoadOptionsByDocumentType.Spreadsheet.*;
import examples.LoadOptionsByDocumentType.Txt.*;
import examples.LoadOptionsByDocumentType.WordProcessing.*;

public class RunExamples {

	public static void main(String[] args) {

		// Upload files
		UploadResources.main(args);

		// Info API examples
		GetSupportedConversions.main(args);
		GetDocumentInformation.main(args);

		// License API examples
		GetMeteredConsumption.main(args);

		// Common API examples
		AddWatermark.main(args);
		ConvertConsecutivePages.main(args);
		ConvertSpecificPages.main(args);
		ConvertUsingCustomFont.main(args);

		// Conversion API examples
		ConvertToWordProcessing.main(args);
		ConvertToPdf.main(args);
		ConvertToPdfResponseBody.main(args);
		ConvertToHtml.main(args);
		ConvertToPresentation.main(args);
		ConvertToSpreadsheet.main(args);
		ConvertToPdfDirect.main(args);
		
		// Load Options By Document Type
		ConvertCadAndSpecifyLoadOptions.main(args);

		ConvertCsvByConvertingDateTimeAndNumericData.main(args);
		ConvertCsvBySpecifyingDelimiter.main(args);
		ConvertCsvBySpecifyingEncoding.main(args);

		ConvertEmailWithAlteringFieldsVisibility.main(args);
		ConvertEmailWithAttachments.main(args);
		ConvertEmailWithTimezoneOffset.main(args);
		ConvertEmailWithFieldLabels.main(args);
		ConvertEmailWithOriginalDate.main(args);

		ConvertHtmlWithPageNumbering.main(args);

		ConvertNoteBySpecifyingFontSubstitution.main(args);

		ConvertPdfAndFlattenAllFields.main(args);
		ConvertPdfAndHideAnnotations.main(args);
		ConvertPdfAndRemoveEmbeddedFiles.main(args);

		ConvertPresentationByHidingComments.main(args);
		ConvertPresentationBySpecifyingFontSubstitution.main(args);
		ConvertPresentationWithHiddenSlidesIncluded.main(args);

		ConvertSpreadsheetAndHideComments.main(args);
		ConvertSpreadsheetByShowingGridLines.main(args);
		ConvertSpreadsheetBySkippingEmptyRowsAndColumns.main(args);
		ConvertSpreadsheetBySpecifyingFontsubstitution.main(args);
		ConvertSpreadsheetBySpecifyingRange.main(args);
		ConvertSpreadsheetWithHiddenSheetsIncluded.main(args);

		ConvertTxtByControllingLeadingSpacesBehavior.main(args);
		ConvertTxtByControllingTrailingSpacesBehavior.main(args);
		ConvertTxtBySpecifyingEncoding.main(args);

		ConvertWordProcessingByHidingComments.main(args);
		ConvertWordProcessingByHidingTrackedChanges.main(args);
		ConvertWordProcessingBySpecifyingFontSubstitution.main(args);		


		// Async API examples
		ConvertToPdfAsync.main(args);		
		ConvertToPdfDirectAsync.main(args);		


		System.out.println("Completed");
	}	
}