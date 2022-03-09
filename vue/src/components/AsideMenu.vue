<template>
    <el-menu
            default-active="2"
            class="el-menu-vertical-demo"
            style="min-height: calc(100vh - 50px);"
    >
        <el-sub-menu index="1">
            <template #title>
                <el-icon>
                    <location/>
                </el-icon>
                <span>Navigator One</span>
            </template>
            <el-menu-item index="1-1">item one</el-menu-item>
            <el-menu-item index="1-2">item one</el-menu-item>
            <el-menu-item index="1-3">item three</el-menu-item>
        </el-sub-menu>
        <el-menu-item index="2">
            <el-icon>
                <icon-menu/>
            </el-icon>
            <span>Navigator Two</span>
        </el-menu-item>
        <el-menu-item index="3">
            <el-icon>
                <document/>
            </el-icon>
            <span>Navigator Three</span>
        </el-menu-item>
        <el-menu-item index="4">
            <el-icon>
                <setting/>
            </el-icon>
            <span>Navigator Four</span>
        </el-menu-item>
    </el-menu>
</template>

<script>
    import {
        Location,
        Document,
        Menu as IconMenu,
        Setting,
    } from '@element-plus/icons-vue'

    export default {
        name: "AsideMenu",
        components:{
            Location,
            Document,
            IconMenu,
            Setting,
        }
    }
</script>

<style scoped>

</style>
