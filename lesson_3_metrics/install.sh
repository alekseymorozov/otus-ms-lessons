minikube start
helm install postgres -f ./charts/postgresql/postgresql-values.yaml bitnami/postgresql --wait
helm install stack prometheus-community/kube-prometheus-stack -f ./charts/stack/stack-values.yaml
helm install crud ./charts/crud/
minikube addons enable ingress
minikube tunnel