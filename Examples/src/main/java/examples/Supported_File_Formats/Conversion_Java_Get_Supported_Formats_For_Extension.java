package examples.Supported_File_Formats;

import com.groupdocs.cloud.conversion.client.*;
import com.groupdocs.cloud.conversion.model.*;
import com.groupdocs.cloud.conversion.model.requests.*;

import java.util.List;

import com.groupdocs.cloud.conversion.api.*;
import examples.Utils;

public class Conversion_Java_Get_Supported_Formats_For_Extension {

	public static void main(String[] args) {

		InfoApi apiInstance = new InfoApi(Utils.AppSID, Utils.AppKey);
		try {
			GetSupportedConversionTypesRequest request = new GetSupportedConversionTypesRequest(null, null, "xlsx");
			List<SupportedFormat> response = apiInstance.getSupportedConversionTypes(request);

			for (SupportedFormat entry : response) {
				for (String formats : entry.getTargetFormats()) {
					System.out.println(entry.getSourceFormat() + " TO " + formats);
				}
			}
		} catch (ApiException e) {
			System.err.println("Exception while calling InfoApi:");
			e.printStackTrace();
		}
	}
}
