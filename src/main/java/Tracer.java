import com.sun.btrace.annotations.BTrace;
import com.sun.btrace.annotations.OnMethod;

import static com.sun.btrace.BTraceUtils.println;

@BTrace
public class Tracer {
    @OnMethod(clazz = "cn.egenie.admin.domain.controller.TenantUpdate", method = "info")
    public static void onThreadStart() {
        println("tracing method start");
    }
}
