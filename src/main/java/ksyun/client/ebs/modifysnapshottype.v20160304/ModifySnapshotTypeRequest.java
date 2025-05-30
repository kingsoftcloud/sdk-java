package ksyun.client.ebs.modifysnapshottype.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname ModifySnapshotTypeRequest
 * @Description 请求参数
 */
@Data
public class ModifySnapshotTypeRequest {
    /***/
    @KsYunField(name = "SnapshotIds", type = 2)
    private List<String> SnapshotIdsList;

}