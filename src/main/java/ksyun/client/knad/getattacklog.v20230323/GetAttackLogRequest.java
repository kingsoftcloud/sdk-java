package ksyun.client.knad.getattacklog.v20230323;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname GetAttackLogRequest
 * @Description 请求参数
 */
@Data
public class GetAttackLogRequest {
    /**
     * 起始时间
     */
    @KsYunField(name = "StartTime")
    private String StartTime;

    /**
     * 终止时间
     */
    @KsYunField(name = "EndTime")
    private String EndTime;

    /***/
    @KsYunField(name = "Ip")
    private String Ip;

    /**
     * 每页条数
     */
    @KsYunField(name = "PageSize")
    private Integer PageSize;

    /**
     * 开始条数
     */
    @KsYunField(name = "OffSet")
    private Integer OffSet;

}