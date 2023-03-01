import pyodbc
from datetime import datetime

# ===========================================================================================================================
def getcon():
    try:
        server = 'localhost'
        database = 'testdb'
        username = 'sa'
        password = '123'
        connection_string = f"DRIVER=SQL Server;SERVER={server};DATABASE={database};UID={username};PWD={password}"
        cnxn = pyodbc.connect(connection_string,autocommit=True)
        cnxn.set_attr(pyodbc.SQL_ATTR_TXN_ISOLATION, pyodbc.SQL_TXN_SERIALIZABLE)
        cnxn.autocommit = False 
        cursor = cnxn.cursor()
        print("connection established successfully")
        return cursor,cnxn
    except:
        print("error occur during connection establishing.............")
def insert(cxn,cur,id,name,age):
    try:
        val = (id,name,age,str(datetime.now()),str(datetime.now()))
        sql = f"INSERT INTO student (id,name,age,updated_at,transaction_at) VALUES {val}"
        cur.execute(sql)
        cur.commit()
        print("data inserted succesfully")
        return cxn,cur
    except:
        print("error occur during insertion")
        cxn.rollback()
def update(cxn,cur,id,age):
      try:
        #   cur.execute(f"update student set age={age} , updated_at={str(datetime.now())} ,transation_at={str(datetime.now())} where id={id}")
          cur.execute(f"update student set age={age} where id={id}")
          cur.commit()
          print("updation operation successfully")

      except:
          print("some error occur during updation")
          cxn.rollback()
          
    
def delete(cxn,cur,id):
    try:
        cur.execute(f"delete from student where id={id}")
        cur.commit()
        print("data deleted successfully")
    except:
        print('some error occured!!!!!!!!!!!!!')
        cxn.rollback()
def select(cxn,cur):
    try:
        rows=cur.execute("select * from student").fetchall()
        for row in rows:
            print(row)
    except:
        print("error occured during fetch data")        
def transaction1(cxn,cur,id,age):
      try:
        #   cur.execute(f"update student set age={age} , updated_at={str(datetime.now())} ,transation_at={str(datetime.now())} where id={id}")
          cur.execute(f"delete from student where id={id}")
          cur.execute(f"update student set age={age/0} where id={id+1}")
          cur.commit()
          print("updation operation successfully")

      except:
          print("some error occur during updation")
          cxn.rollback()
  