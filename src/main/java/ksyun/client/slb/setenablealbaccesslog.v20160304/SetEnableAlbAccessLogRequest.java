package ksyun.client.slb.setenablealbaccesslog.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname SetEnableAlbAccessLogRequest
 * @Description 请求参数
 */
@Data
public class SetEnableAlbAccessLogRequest {
    /**
     * 应用型负载均衡的ID
     */
    @KsYunField(name = "AlbId")
    private String AlbId;

    /**
     * 是否开启日志服务
     */
    @KsYunField(name = "EnabledLog")
    private Boolean EnabledLog;

}