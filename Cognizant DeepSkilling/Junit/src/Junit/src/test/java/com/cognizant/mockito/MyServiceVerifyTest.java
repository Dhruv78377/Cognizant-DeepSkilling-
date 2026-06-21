package com.cognizant.mockito;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.mockito.Mockito.verify;

import com.cognizant.service.ExternalApi;
import com.cognizant.service.MyService;

public class MyServiceVerifyTest {

    @Test
    public void testVerifyInteraction() {

        // Create mock object
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);

        // Inject mock into service
        MyService service = new MyService(mockApi);

        // Call method
        service.processData("Hello Mockito");

        // Verify interaction
        verify(mockApi).sendData("Hello Mockito");
    }
}