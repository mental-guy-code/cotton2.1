<template>
    <div>
        <el-affix>
            <Header></Header>
        </el-affix>
        <el-row class="tac">
            <el-col :span="4">
                <el-affix :offset="50">
                    <AsideMenu></AsideMenu>
                </el-affix>
            </el-col>
            <el-col :span="20">
                <router-view></router-view>
            </el-col>

        </el-row>
    </div>
</template>

<style>

</style>

<script>
    import Header from "./components/Header";
    import AsideMenu from "./components/AsideMenu";

    export default {
        name: "layout",
        components: {
            AsideMenu,
            Header,

        }
    }
</script>
