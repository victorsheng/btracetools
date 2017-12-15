import com.sun.btrace.AnyType;
import com.sun.btrace.annotations.*;

import static com.sun.btrace.BTraceUtils.println;


@BTrace
public class PrintReturn {

    @OnMethod(clazz = "cn.egenie.admin.domain.controller.TenantUpdate", method = "info", location = @Location(value = Kind.RETURN))
    public static void o(@Self Object self, String prefix, String suffix, @Return AnyType result) {
        println(self + prefix + suffix + result);
    }
}




