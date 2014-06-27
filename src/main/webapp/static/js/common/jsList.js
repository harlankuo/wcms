/**
 * 文件名：jsList.js
 * 版本信息：1.0
 * 日期：2014年06月26日-15:37
 * 作者：harlankuo
 * Copyright (c)2014版权所有--harlankuo
 */
function List() {

    this.value = [];


    /*添加*/
    this.add = function (obj) {
        return this.value.push(obj);
    };

    /*大小*/
    this.size = function () {
        return this.value.length;
    }

    /*返回指定索引的值*/
    this.get = function (index) {
        return this.value[index];
    }

    /*删除指定索引的值*/
    this.remove = function (index) {
        var array = new Array();
        for (var i = 0; i < this.size(); i++) {
            if (i == index) continue;
            array.push(this.value[i]);
        }
        return array;
    }

    /*删除全部值*/
    this.removeAll = function () {
        return this.value = [];
    }

    /*是否包含某个对象*/
    this.constains = function (obj) {
        for (var i in this.value) {
            if (obj == this.value[i]) {
                return true;
            } else {
                continue;
            }
        }
        return false;
    }

}