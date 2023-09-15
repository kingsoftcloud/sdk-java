package ksyun.client.kcs.getdailyanalyzeswitchstate.v20160701;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname GetDailyAnalyzeSwitchStateRequest
* @Description 请求参数
*/
@Data
public class GetDailyAnalyzeSwitchStateRequest{
    /**缓存服务ID（实例ID）*/
    @KsYunField(name="CacheId")
    private String CacheId;


}