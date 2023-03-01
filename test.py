
from functions import *
from datetime import datetime
cur,cnxn=getcon()
now = str(datetime.now())

# insert(cnxn,cur,2,'pankaj',21)
select(cnxn,cur)
transaction1(cnxn,cur,2,798)
select(cnxn,cur)
# update(cnxn,cur,4,40)
cnxn.close()



