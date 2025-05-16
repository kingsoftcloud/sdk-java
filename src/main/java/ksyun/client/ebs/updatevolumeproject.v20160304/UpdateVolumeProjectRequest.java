package ksyun.client.ebs.updatevolumeproject.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname UpdateVolumeProjectRequest
 * @Description 请求参数
 */
@Data
public class UpdateVolumeProjectRequest {
    /**
     * 硬盘ID，传参方式请参照示例.长度36个字符，包括字母、数字、-.PS:最多传入100个.N为1~100,硬盘状态必须为待挂载（available）
     */
    @KsYunField(name = "VolumeId")
    private List<String> VolumeIdList;

    /**
     * 目标项目组id，项目组状态必须为可用
     */
    @KsYunField(name = "ProjectId")
    private String ProjectId;

}