package org.opensrp.api.domain;

import com.openpojo.reflection.PojoClass;
import com.openpojo.reflection.construct.InstanceFactory;
import com.openpojo.reflection.impl.PojoClassFactory;
import com.openpojo.validation.affirm.Affirm;

import junit.framework.Assert;

import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class TimeTest {

    private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    @Test
    @SuppressWarnings("RedundantArrayCreation")
    public void shouldTestConstructorUsingDefaultConstructor() {
        final Class<?> clazz = Time.class;
        final Object obj1 = getInstance(clazz, new Date(), TimeZone.getTimeZone("BDT"));
        Affirm.affirmNotNull("Should have created an object", obj1);
        final Time time = (Time) getInstance(clazz, new Date(), TimeZone.getTimeZone("BDT"));
        Assert.assertEquals(DATE_FORMAT.format(new Date()), time.getTime());
    }

    private Object getInstance(final Class<?> clazz, final Object... parameters) {
        final PojoClass pojoClass = PojoClassFactory.getPojoClass(clazz);
        return InstanceFactory.getInstance(pojoClass, parameters);
    }

}
