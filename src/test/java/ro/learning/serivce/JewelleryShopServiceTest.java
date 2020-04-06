package ro.learning.serivce;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.kie.api.runtime.KieContainer;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
class JewelleryShopServiceTest {

    @InjectMocks
    private JewelleryShopService classUnderTest;
    @Mock
    private KieContainer kieContainer;

    @Test
    public void test(){

    }
}