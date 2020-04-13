import pybrake

# pybrak notifier
notifier = pybrake.Notifier(project_id=267681,project_key='3f12af45d28eb6ac3d0891a463580efd',environment='production')


try:
    raise ValueError('hello')
except Exception as err:
    notifier.notify(err)