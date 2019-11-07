package example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.test.web.servlet.MockMvc;
import org.testng.annotations.Test;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
public class SomeControllerTest extends AbstractTestNGSpringContextTests {
    @Autowired MockMvc mockMvc;

    @Test
    public void testAsync() throws Exception {
        mockMvc.perform( get( "/async" ) )
                .andExpect( content().string( Application.RESPONSE ) );
    }

    @Test
    public void testNormal() throws Exception {
        mockMvc.perform( get( "/normal" ) )
                .andExpect( content().string( Application.RESPONSE ) );
    }
}
