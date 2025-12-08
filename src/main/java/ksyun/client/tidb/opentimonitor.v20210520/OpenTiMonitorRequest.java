package ksyun.client.tidb.opentimonitor.v20210520;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname OpenTiMonitorRequest
* @Description 请求参数
*/
@Data
public class OpenTiMonitorRequest{
    /**实例ID*/
    @KsYunField(name="InstanceId")
    private String InstanceId;

}
