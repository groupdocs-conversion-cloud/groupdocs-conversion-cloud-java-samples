package examples.Info;

import com.groupdocs.cloud.conversion.client.*;
import com.groupdocs.cloud.conversion.model.*;

import com.groupdocs.cloud.conversion.api.LicenseApi;
import examples.Constants;

/**
 * This example demonstrates how to get metered license information
 */
public class GetMeteredInfo {

	public static void main(String[] args) {
		
		LicenseApi apiInstance = new LicenseApi(Constants.GetConfiguration());
		
		try {
			LicenseInfo response = apiInstance.getLicenseInfo();

			System.out.println("IsLicensed: " + response.getIsLicensed());			
		} catch (ApiException e) {
			System.err.println("Exception while calling LicenseApi:");
			e.printStackTrace();
		}
	}
}