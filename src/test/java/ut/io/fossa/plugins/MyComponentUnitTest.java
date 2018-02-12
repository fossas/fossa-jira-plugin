package ut.io.fossa.plugins;

import org.junit.Test;
import io.fossa.plugins.api.MyPluginComponent;
import io.fossa.plugins.impl.MyPluginComponentImpl;

import static org.junit.Assert.assertEquals;

public class MyComponentUnitTest
{
    @Test
    public void testMyName()
    {
        MyPluginComponent component = new MyPluginComponentImpl(null);
        assertEquals("names do not match!", "myComponent",component.getName());
    }
}