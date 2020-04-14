import pybrake

# pybrak notifier
notifier = pybrake.Notifier(project_id=267681,project_key='',environment='production')


try:
    raise ValueError('hello')
except Exception as err:
    notifier.notify(err)