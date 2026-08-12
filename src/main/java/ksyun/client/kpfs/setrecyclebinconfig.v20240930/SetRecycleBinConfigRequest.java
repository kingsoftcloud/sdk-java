package ksyun.client.kpfs.setrecyclebinconfig.v20240930;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname SetRecycleBinConfigRequest
* @Description 请求参数
*/
@Data
public class SetRecycleBinConfigRequest{
    /**文件系统ID*/
    @KsYunField(name="FileSystemId")
    private String FileSystemId;

    /**回收站状态
• on：启用回收站
• off：关闭回收站*/
    @KsYunField(name="Enabled")
    private String Enabled;

    /**回收站中文件的保留时间。若启用回收站，则必传
• 容量型&标准型限制1-30天
• 性能型限制1-720小时*/
    @KsYunField(name="ExpireTime")
    private Integer ExpireTime;

    /**过期时间类型
• DAY：天
• HOUR:小时（仅性能型支持）*/
    @KsYunField(name="ExpireType")
    private String ExpireType;

}
