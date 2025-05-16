package ksyun.client.ked.clouddeskmanage.v20250501;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname CloudDeskmanageRequest
 * @Description 请求参数
 */
@Data
public class CloudDeskmanageRequest {
    /**
     * 云电脑 id 列表
     */
    @KsYunField(name = "instanceIds", type = 2)
    private List<String> InstanceIdsList;

    /**
     * start 开机
     * stop 关机
     * reboot 重启
     * forcedUnbind 强制解绑用户
     * delete 删除
     * lock 锁定
     * unlock 解锁
     */
    @KsYunField(name = "action1")
    private String Action1;

}