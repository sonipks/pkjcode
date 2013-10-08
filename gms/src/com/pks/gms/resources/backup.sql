drop table tran_data_hist;
create table tran_data_hist as select * from tran_data;
select count(*) from tran_data;
select count(*) from tran_data_hist;
select * from tran_data_hist;