package ksyun.client.kpfs.getrecyclebinconfig.v20240930;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname GetRecycleBinConfigResponse
* @Description GetRecycleBinConfig 返回体
*/
@Data
@ToString
public class GetRecycleBinConfigResponse extends BaseResponseModel {

    /**回收站状态
• on：回收站已启用
• off：回收站已关闭*/
    @JsonProperty("Enabled")
    private String Enabled;

    /**回收站中文件的保留时间*/
    @JsonProperty("ExpireTime")
    private Integer ExpireTime;

    /**过期时间类型
• DAY：天
• HOUR:小时（仅性能型支持）
*/
    @JsonProperty("ExpireType")
    private String ExpireType;

    /**唯一请求ID，每次请求都会返回。*/
    @JsonProperty("RequestId")
    private String RequestId;

}
