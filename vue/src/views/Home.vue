<template>
    <div style="flex: 1; padding: 30px; ">
        <div style="margin: 10px 10px; width: 30%; display: flex; background-color: cornsilk">
            <el-input v-model="search_gene" class="w-50 m-2" size="large" placeholder="Type something">
                <template #prefix>
                    <el-icon class="el-input__icon"><search /></el-icon>
                </template>
            </el-input>
            <el-button type="primary" size="large" style="margin-left: 5px">
                <el-icon class="el-input__icon"><search/></el-icon>
                Search
            </el-button>
        </div>
        <el-table :data="tableData" stripe style="width: auto;">
            <el-table-column prop="date" label="Date" width="180" sortable=""></el-table-column>
            <el-table-column prop="name" label="Name" width="180"></el-table-column>
            <el-table-column prop="address" label="Address"></el-table-column>
        </el-table>
        <div>
            <el-pagination
                    v-model:currentPage="currentPage"
                    v-model:page-size="pageSize"
                    :page-sizes="[10, 20, 100, 400]"
                    layout="total, sizes, prev, pager, next, jumper"
                    :total="total"
                    @size-change="handleSizeChange"
                    @current-change="handleCurrentChange"
            >
            </el-pagination>
        </div>
    </div>
</template>

<script>
// @ is an alias to /src
import { Search } from '@element-plus/icons-vue'
import { ref } from 'vue'

const currentPage = ref()
const pageSize = ref()

export default {
    name: 'Home',
    components: {
        Search,
        ref
    },
    data(){
        return{
            search_gene:"",
            total:100,
            currentPage:1,
            pageSize:10,
            tableData : [
                {
                    date: '2016-05-03',
                    name: 'Tom',
                    address: 'No. 189, Grove St, Los Angeles',
                },
                {
                    date: '2016-05-02',
                    name: 'Tom',
                    address: 'No. 189, Grove St, Los Angeles',
                },
                {
                    date: '2016-05-04',
                    name: 'Tom',
                    address: 'No. 189, Grove St, Los Angeles',
                },
                {
                    date: '2016-05-01',
                    name: 'Tom',
                    address: 'No. 189, Grove St, Los Angeles',
                },
            ]
        }

    },
    methods:{
        handleSizeChange : () => {
        },
        handleCurrentChange : () => {
        }
    }
}
</script>
