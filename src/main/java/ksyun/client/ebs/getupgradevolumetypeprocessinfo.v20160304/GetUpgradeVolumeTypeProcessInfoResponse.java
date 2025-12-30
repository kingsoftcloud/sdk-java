package ksyun.client.ebs.getupgradevolumetypeprocessinfo.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname GetUpgradeVolumeTypeProcessInfoResponse
* @Description GetUpgradeVolumeTypeProcessInfo 返回体
*/
@Data
@ToString
public class GetUpgradeVolumeTypeProcessInfoResponse extends BaseResponseModel {

    /**267168cc-28c6-4991-85d0-e851c5d6c49b*/
    @JsonProperty("RequestId")
    private String RequestId;

}
