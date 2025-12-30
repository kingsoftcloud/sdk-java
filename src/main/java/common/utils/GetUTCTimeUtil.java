/*
 * Decompiled with CFR 0.152.
 */
package common.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class GetUTCTimeUtil {
    private static ThreadLocal<SimpleDateFormat> utcFormatThreadLocal = ThreadLocal.withInitial(() -> {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
        dateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        return dateFormat;
    });

    public static String getUTCTimeStr() {
        Calendar cal = Calendar.getInstance();
        cal.setTimeZone(TimeZone.getTimeZone("UTC"));
        int zoneOffset = cal.get(15);
        int dstOffset = cal.get(16);
        cal.add(14, -(zoneOffset + dstOffset));
        Date utcDate = cal.getTime();
        return utcFormatThreadLocal.get().format(utcDate);
    }

    public static void main(String[] args) {
        int corePoolSize = 5;
        int maxPoolSize = 10;
        long keepAliveTime = 60L;
        TimeUnit unit = TimeUnit.SECONDS;
        ArrayBlockingQueue<Runnable> workQueue = new ArrayBlockingQueue<Runnable>(100);
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(corePoolSize, maxPoolSize, keepAliveTime, unit, workQueue);
        for (int i = 0; i < 10000; ++i) {
            threadPoolExecutor.execute(() -> {
                String utcTimeStr = GetUTCTimeUtil.getUTCTimeStr();
                System.out.println("utcTimeStr=" + utcTimeStr);
            });
        }
        threadPoolExecutor.shutdown();
    }
}

