minikube start
helm install postgres -f ./charts/postgresql/postgresql-values.yaml bitnami/postgresql --wait
helm install stack prometheus-community/kube-prometheus-stack -f ./charts/stack/stack-values.yaml --wait
helm install crud ./charts/crud/ --wait
minikube addons enable ingress
minikube tunnel