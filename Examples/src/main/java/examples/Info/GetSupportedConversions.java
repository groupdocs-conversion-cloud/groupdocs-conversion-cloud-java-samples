package examples.Info;

import com.groupdocs.cloud.conversion.client.*;
import com.groupdocs.cloud.conversion.model.*;

import java.util.List;

import com.groupdocs.cloud.conversion.api.InfoApi;
import com.groupdocs.cloud.conversion.model.requests.*;
import examples.Constants;

/**
 * This example demonstrates how to obtain all supported document conversions
 */
public class GetSupportedConversions {

	public static void main(String[] args) {
		
		InfoApi apiInstance = new InfoApi(Constants.GetConfiguration());
		
		try {
			List<SupportedFormat> response = apiInstance.getSupportedConversionTypes(new GetSupportedConversionTypesRequest());

			System.out.println("Formats count: " + response.size());
		} catch (ApiException e) {
			System.err.println("Exception while calling InfoApi:");
			e.printStackTrace();
		}
	}
}