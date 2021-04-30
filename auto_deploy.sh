P_ID=$(ps -ef | grep -w justice_eternal-0.0.1-SNAPSHOT.jar | grep -v "grep" | awk '{print $2}')
        if [ "$P_ID" == "" ]; then
                echo "===justice_eternal-0.0.1-SNAPSHOT.jar process not exists or stop success"
        else
                kill -9 "$P_ID"
                echo "justice_eternal-0.0.1-SNAPSHOT.jar killed success"
        fi
mvn -B package --file pom.xml
cd target/
nohup java -Xmx128m -Xms128m -jar justice_eternal-0.0.1-SNAPSHOT.jar > justice_eternal.log 2>&1 &