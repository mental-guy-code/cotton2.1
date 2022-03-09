<template>
    <div class="nav">
        <div style="width: 200px;padding-left: 30px;font-weight: bold;color: deepskyblue;">
            CottonOmics2.0
        </div>
        <div style="flex: 1"></div>
        <div style="width: 200px; display: flex; align-items: center">
            <el-dropdown>
                <span class="el-dropdown-link">
                    Dropdown List
                    <el-icon class="el-icon--right">
                        <arrow-down/>
                    </el-icon>
                </span>
                <template #dropdown>
                    <el-dropdown-menu>
                        <el-dropdown-item>Action 1</el-dropdown-item>
                        <el-dropdown-item>Action 2</el-dropdown-item>
                        <el-dropdown-item>Action 3</el-dropdown-item>
                    </el-dropdown-menu>
                </template>
            </el-dropdown>
        </div>
    </div>
</template>

<script>


import {ArrowDown} from "@element-plus/icons-vue";

export default {
    name: "Header",
    components: {
        ArrowDown
  },
};
</script>

<style>
    .nav {
        height: 50px;
        line-height: 50px;
        border-bottom: 1px solid #ccc;
        display: flex;
        background-color: white;
    }

    .el-dropdown-link {
        cursor: pointer;
        color: var(--el-color-primary);
        display: flex;
        align-items: center;
    }
</style>
